package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Passport: ImageVector? = null

val Icons.Rr.Passport: ImageVector
    get() = _Passport ?: UXIcon(name = "Passport") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 20f)
                lineTo(8f, 20f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(8f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(22f, 19f)
                lineTo(22f, 5f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                lineTo(7f, 0f)
                curveTo(4.24f, 0f, 2f, 2.24f, 2f, 5f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(10f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                close()
                moveTo(17f, 2f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                lineTo(7f, 22f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                lineTo(4f, 5f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(10f)
                close()
                moveTo(11.05f, 11f)
                curveToRelative(0.11f, 2.56f, 0.43f, 4.83f, 0.98f, 4.83f)
                reflectiveCurveToRelative(0.87f, -2.27f, 0.98f, -4.83f)
                horizontalLineToRelative(-1.95f)
                close()
                moveTo(14.61f, 5.67f)
                curveToRelative(-0.1f, -0.49f, 0.47f, -0.84f, 0.88f, -0.55f)
                curveToRelative(1.27f, 0.9f, 2.18f, 2.28f, 2.45f, 3.88f)
                horizontalLineToRelative(-2.94f)
                curveToRelative(-0.04f, -0.86f, -0.14f, -2.12f, -0.39f, -3.33f)
                close()
                moveTo(12.02f, 4.17f)
                curveToRelative(0.56f, 0f, 0.87f, 2.27f, 0.98f, 4.83f)
                horizontalLineToRelative(-1.95f)
                curveToRelative(0.11f, -2.56f, 0.42f, -4.83f, 0.98f, -4.83f)
                close()
                moveTo(9.44f, 5.67f)
                curveToRelative(-0.25f, 1.22f, -0.35f, 2.47f, -0.39f, 3.33f)
                horizontalLineToRelative(-2.94f)
                curveToRelative(0.27f, -1.6f, 1.18f, -2.98f, 2.45f, -3.88f)
                curveToRelative(0.41f, -0.29f, 0.98f, 0.06f, 0.88f, 0.55f)
                close()
                moveTo(14.61f, 14.33f)
                curveToRelative(0.25f, -1.22f, 0.35f, -2.47f, 0.39f, -3.33f)
                horizontalLineToRelative(2.94f)
                curveToRelative(-0.27f, 1.6f, -1.18f, 2.98f, -2.45f, 3.88f)
                curveToRelative(-0.41f, 0.29f, -0.98f, -0.06f, -0.88f, -0.55f)
                close()
                moveTo(9.44f, 14.33f)
                curveToRelative(0.1f, 0.49f, -0.47f, 0.84f, -0.88f, 0.55f)
                curveToRelative(-1.27f, -0.9f, -2.18f, -2.28f, -2.45f, -3.88f)
                horizontalLineToRelative(2.94f)
                curveToRelative(0.04f, 0.86f, 0.14f, 2.12f, 0.39f, 3.33f)
                close()
            }
        }.also { _Passport = it}
