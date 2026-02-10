package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BlockBrickFire: ImageVector? = null

val Icons.Bs.BlockBrickFire: ImageVector
    get() = _BlockBrickFire ?: UXIcon(name = "BlockBrickFire") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.5f, 0f)
                lineTo(3.5f, 0f)
                curveTo(1.57f, 0f, 0f, 1.57f, 0f, 3.5f)
                verticalLineToRelative(20.5f)
                horizontalLineToRelative(12.73f)
                curveToRelative(-0.93f, -0.82f, -1.67f, -1.84f, -2.14f, -3f)
                lineTo(3f, 21f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(7.08f)
                curveToRelative(0.18f, -1.18f, 0.68f, -2.18f, 1.25f, -3f)
                horizontalLineToRelative(-2.33f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(6.0f)
                lineToRelative(2.89f, -2.93f)
                reflectiveCurveToRelative(5.18f, 4.78f, 6.11f, 5.92f)
                lineTo(24f, 3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(6f, 14f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(4f)
                close()
                moveTo(3f, 7f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(7.5f)
                verticalLineToRelative(4f)
                lineTo(3f, 7f)
                close()
                moveTo(14f, 7f)
                lineTo(14f, 3f)
                horizontalLineToRelative(6.5f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(-7f)
                close()
                moveTo(18f, 10f)
                curveToRelative(-1.82f, 2.1f, -1.46f, 6f, -2.72f, 6f)
                curveToRelative(-0.61f, 0f, -1.29f, -2.09f, -1.29f, -2.09f)
                curveToRelative(-0.99f, 1.03f, -2.0f, 2.36f, -2.0f, 4.09f)
                curveToRelative(0f, 3.31f, 2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                curveToRelative(0f, -3.47f, -4.11f, -6.11f, -6f, -8f)
                close()
                moveTo(19.41f, 21.41f)
                curveToRelative(-0.78f, 0.78f, -2.05f, 0.78f, -2.83f, 0f)
                curveToRelative(-0.78f, -0.78f, -0.78f, -2.05f, 0f, -2.83f)
                lineToRelative(1.42f, -1.42f)
                lineToRelative(1.42f, 1.42f)
                horizontalLineToRelative(0f)
                curveToRelative(0.78f, 0.78f, 0.78f, 2.05f, 0f, 2.83f)
                close()
            }
        }.also { _BlockBrickFire = it}
