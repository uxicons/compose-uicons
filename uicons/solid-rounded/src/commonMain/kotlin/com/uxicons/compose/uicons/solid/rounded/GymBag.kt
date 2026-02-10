package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GymBag: ImageVector? = null

val Icons.Sr.GymBag: ImageVector
    get() = _GymBag ?: UXIcon(name = "GymBag") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 8f)
                curveToRelative(0f, -3.86f, -3.14f, -7f, -7f, -7f)
                reflectiveCurveToRelative(-7f, 3.14f, -7f, 7f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(14f)
                close()
                moveTo(13f, 16f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(17f, 9f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                close()
                moveTo(3f, 22.58f)
                curveToRelative(-1.76f, -0.77f, -3f, -2.53f, -3f, -4.58f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -2.04f, 1.24f, -3.8f, 3f, -4.58f)
                close()
                moveTo(24f, 14f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 1.84f, -1.01f, 3.44f, -2.5f, 4.3f)
                verticalLineToRelative(-12.61f)
                curveToRelative(1.49f, 0.87f, 2.5f, 2.46f, 2.5f, 4.3f)
                close()
            }
        }.also { _GymBag = it}
