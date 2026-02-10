package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EnvelopeBan: ImageVector? = null

val Icons.Ts.EnvelopeBan: ImageVector
    get() = _EnvelopeBan ?: UXIcon(name = "EnvelopeBan") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 10.0f)
                curveToRelative(1.28f, 0f, 2.56f, -0.49f, 3.54f, -1.46f)
                curveToRelative(1.95f, -1.95f, 1.95f, -5.12f, 0f, -7.07f)
                reflectiveCurveToRelative(-5.12f, -1.95f, -7.07f, 0f)
                reflectiveCurveToRelative(-1.95f, 5.12f, 0f, 7.07f)
                curveToRelative(0.97f, 0.97f, 2.25f, 1.46f, 3.54f, 1.46f)
                close()
                moveTo(21.83f, 7.83f)
                curveToRelative(-1.44f, 1.44f, -3.71f, 1.55f, -5.28f, 0.33f)
                lineToRelative(5.61f, -5.61f)
                curveToRelative(1.22f, 1.57f, 1.11f, 3.84f, -0.33f, 5.28f)
                close()
                moveTo(16.17f, 2.17f)
                curveToRelative(0.78f, -0.78f, 1.8f, -1.17f, 2.83f, -1.17f)
                curveToRelative(0.87f, 0f, 1.73f, 0.28f, 2.45f, 0.84f)
                lineToRelative(-5.61f, 5.61f)
                curveToRelative(-1.22f, -1.57f, -1.11f, -3.84f, 0.33f, -5.28f)
                close()
                moveTo(24.0f, 9.89f)
                verticalLineToRelative(14.11f)
                lineTo(0f, 24.0f)
                lineTo(0f, 6.5f)
                curveTo(0f, 5.12f, 1.12f, 4f, 2.5f, 4f)
                horizontalLineToRelative(9.5f)
                verticalLineToRelative(1f)
                lineTo(2.5f, 5f)
                curveToRelative(-0.53f, 0f, -1.0f, 0.28f, -1.27f, 0.7f)
                lineToRelative(8.27f, 8.28f)
                curveToRelative(1.36f, 1.36f, 3.58f, 1.36f, 4.95f, 0f)
                horizontalLineToRelative(0f)
                reflectiveCurveToRelative(0f, 0f, 0f, 0f)
                lineToRelative(2.28f, -2.36f)
                curveToRelative(0.36f, 0.12f, 0.74f, 0.22f, 1.12f, 0.28f)
                lineToRelative(-2.69f, 2.78f)
                horizontalLineToRelative(0f)
                reflectiveCurveToRelative(0f, 0f, 0f, 0f)
                curveToRelative(-0.88f, 0.88f, -2.03f, 1.32f, -3.18f, 1.32f)
                reflectiveCurveToRelative(-2.31f, -0.44f, -3.18f, -1.32f)
                lineTo(1f, 6.88f)
                verticalLineToRelative(16.12f)
                horizontalLineToRelative(22f)
                verticalLineToRelative(-12.26f)
                curveToRelative(0.36f, -0.25f, 0.69f, -0.53f, 1f, -0.85f)
                close()
            }
        }.also { _EnvelopeBan = it}
