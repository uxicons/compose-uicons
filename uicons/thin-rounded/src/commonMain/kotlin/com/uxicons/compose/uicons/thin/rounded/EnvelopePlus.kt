package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EnvelopePlus: ImageVector? = null

val Icons.Tr.EnvelopePlus: ImageVector
    get() = _EnvelopePlus ?: UXIcon(name = "EnvelopePlus") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15f, 4.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(3.5f)
                lineTo(19f, 0.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                reflectiveCurveToRelative(-0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(3.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                close()
                moveTo(23.5f, 7f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                lineTo(4.5f, 23f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineTo(1f, 7.86f)
                lineToRelative(7.82f, 7.82f)
                curveToRelative(0.88f, 0.88f, 2.03f, 1.32f, 3.18f, 1.32f)
                reflectiveCurveToRelative(2.3f, -0.44f, 3.18f, -1.31f)
                lineToRelative(3.88f, -3.83f)
                curveToRelative(0.2f, -0.19f, 0.2f, -0.51f, 0.0f, -0.71f)
                curveToRelative(-0.2f, -0.2f, -0.51f, -0.2f, -0.71f, -0.0f)
                lineToRelative(-3.88f, 3.83f)
                curveToRelative(-1.36f, 1.36f, -3.59f, 1.36f, -4.95f, 0f)
                lineTo(1.12f, 6.57f)
                curveToRelative(0.41f, -1.48f, 1.77f, -2.57f, 3.38f, -2.57f)
                horizontalLineToRelative(8f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                lineTo(4.5f, 3f)
                curveTo(2.02f, 3f, 0f, 5.02f, 0f, 7.5f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(15f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                lineTo(24f, 7.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                close()
            }
        }.also { _EnvelopePlus = it}
