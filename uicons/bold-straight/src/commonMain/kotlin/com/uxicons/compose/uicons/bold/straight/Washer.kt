package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Washer: ImageVector? = null

val Icons.Bs.Washer: ImageVector
    get() = _Washer ?: UXIcon(name = "Washer") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9f, 5.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(6.17f, 12.62f)
                curveToRelative(0.81f, -0.41f, 1.74f, -0.56f, 1.77f, -0.57f)
                curveToRelative(1.23f, -0.16f, 2.67f, 0.19f, 4.29f, 1.06f)
                curveToRelative(1.23f, 0.66f, 2.29f, 0.95f, 3.08f, 0.84f)
                curveToRelative(1.41f, -0.15f, 2.27f, -1.22f, 2.48f, -1.5f)
                curveToRelative(-0.68f, -2.57f, -3.01f, -4.46f, -5.79f, -4.46f)
                curveToRelative(-2.84f, 0f, -5.21f, 1.97f, -5.83f, 4.62f)
                close()
                moveTo(15.58f, 15.94f)
                curveToRelative(-1.23f, 0.16f, -2.67f, -0.19f, -4.29f, -1.06f)
                curveToRelative(-1.23f, -0.66f, -2.29f, -0.95f, -3.08f, -0.84f)
                curveToRelative(-0.02f, 0.0f, -1.09f, 0.15f, -2.1f, 1.08f)
                curveToRelative(0.52f, 2.78f, 2.96f, 4.88f, 5.89f, 4.88f)
                curveToRelative(2.96f, 0f, 5.41f, -2.14f, 5.9f, -4.95f)
                curveToRelative(-1.21f, 0.78f, -2.29f, 0.89f, -2.33f, 0.9f)
                close()
                moveTo(23f, 3.5f)
                verticalLineToRelative(20.5f)
                lineTo(1f, 24f)
                lineTo(1f, 3.5f)
                curveTo(1f, 1.57f, 2.57f, 0f, 4.5f, 0f)
                horizontalLineToRelative(15f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(20f, 3.5f)
                curveToRelative(0f, -0.28f, -0.23f, -0.5f, -0.5f, -0.5f)
                lineTo(4.5f, 3f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(17.5f)
                horizontalLineToRelative(16f)
                lineTo(20f, 3.5f)
                close()
                moveTo(8f, 5.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
            }
        }.also { _Washer = it}
