package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SelfCare: ImageVector? = null

val Icons.Bs.SelfCare: ImageVector
    get() = _SelfCare ?: UXIcon(name = "SelfCare") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6f, 16.2f)
                curveToRelative(0f, 0.66f, 0.17f, 1.29f, 0.44f, 1.89f)
                curveToRelative(-0.28f, 0.4f, -0.44f, 0.89f, -0.44f, 1.41f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0f, -2.29f, 1.4f, -4.25f, 3.39f, -5.08f)
                curveToRelative(-0.24f, 0.54f, -0.39f, 1.14f, -0.39f, 1.78f)
                close()
                moveTo(17.61f, 14.42f)
                curveToRelative(0.24f, 0.54f, 0.39f, 1.14f, 0.39f, 1.78f)
                curveToRelative(0f, 0.66f, -0.17f, 1.29f, -0.44f, 1.89f)
                curveToRelative(0.28f, 0.4f, 0.44f, 0.89f, 0.44f, 1.41f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0f, -2.29f, -1.4f, -4.25f, -3.39f, -5.08f)
                close()
                moveTo(18f, 6f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                reflectiveCurveToRelative(2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                close()
                moveTo(15f, 6f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.35f, -3f, 3f)
                reflectiveCurveToRelative(1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                close()
                moveTo(14f, 14f)
                curveToRelative(-1.1f, 0f, -2f, 0.98f, -2f, 2.2f)
                curveToRelative(0f, -1.22f, -0.9f, -2.2f, -2f, -2.2f)
                reflectiveCurveToRelative(-2f, 0.98f, -2f, 2.2f)
                curveToRelative(0f, 2.3f, 4f, 4.8f, 4f, 4.8f)
                reflectiveCurveToRelative(4f, -2.5f, 4f, -4.8f)
                curveToRelative(0f, -1.22f, -0.9f, -2.2f, -2f, -2.2f)
                close()
            }
        }.also { _SelfCare = it}
