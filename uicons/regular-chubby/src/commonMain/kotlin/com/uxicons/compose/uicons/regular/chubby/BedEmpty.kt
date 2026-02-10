package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BedEmpty: ImageVector? = null

val Icons.Rc.BedEmpty: ImageVector
    get() = _BedEmpty ?: UXIcon(name = "BedEmpty") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.11f, 11.51f)
                curveToRelative(-0.04f, -0.01f, -4.62f, -0.51f, -10.11f, -0.51f)
                curveToRelative(-3.89f, 0f, -7.32f, 0.25f, -9f, 0.4f)
                verticalLineToRelative(-7.4f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(16f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-1.4f)
                curveToRelative(1.68f, 0.15f, 5.11f, 0.4f, 9f, 0.4f)
                reflectiveCurveToRelative(7.32f, -0.25f, 9f, -0.4f)
                verticalLineToRelative(1.4f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-7.5f)
                curveToRelative(0f, -0.51f, -0.38f, -0.94f, -0.89f, -0.99f)
                close()
                moveTo(12f, 17f)
                curveToRelative(-3.97f, 0f, -7.43f, -0.27f, -9f, -0.41f)
                verticalLineToRelative(-3.19f)
                curveToRelative(1.57f, -0.14f, 5.03f, -0.41f, 9f, -0.41f)
                reflectiveCurveToRelative(7.43f, 0.27f, 9f, 0.41f)
                verticalLineToRelative(3.19f)
                curveToRelative(-1.57f, 0.14f, -5.03f, 0.41f, -9f, 0.41f)
                close()
            }
        }.also { _BedEmpty = it}
