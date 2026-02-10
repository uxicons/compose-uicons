package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EnvelopeBan: ImageVector? = null

val Icons.Tr.EnvelopeBan: ImageVector
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
                moveTo(24.0f, 11.5f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
                lineTo(4.5f, 24.0f)
                curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
                lineTo(0f, 7.5f)
                curveTo(0f, 5.02f, 2.02f, 3f, 4.5f, 3f)
                horizontalLineToRelative(7f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                reflectiveCurveToRelative(-0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-7f)
                curveToRelative(-1.61f, 0f, -2.97f, 1.09f, -3.38f, 2.57f)
                lineToRelative(8.4f, 8.4f)
                curveToRelative(1.36f, 1.36f, 3.58f, 1.36f, 4.95f, 0f)
                lineToRelative(2.87f, -2.83f)
                curveToRelative(0.2f, -0.19f, 0.51f, -0.19f, 0.71f, 0.01f)
                curveToRelative(0.19f, 0.2f, 0.19f, 0.51f, -0.01f, 0.71f)
                lineToRelative(-2.87f, 2.83f)
                curveToRelative(-0.88f, 0.88f, -2.03f, 1.31f, -3.18f, 1.31f)
                reflectiveCurveToRelative(-2.31f, -0.44f, -3.18f, -1.32f)
                lineTo(1f, 7.86f)
                verticalLineToRelative(11.64f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(15f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-8f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                close()
            }
        }.also { _EnvelopeBan = it}
