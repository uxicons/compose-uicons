package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Passport: ImageVector? = null

val Icons.Rs.Passport: ImageVector
    get() = _Passport ?: UXIcon(name = "Passport") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 24f)
                lineTo(2f, 24f)
                lineTo(2f, 3f)
                curveTo(2f, 1.35f, 3.35f, 0f, 5f, 0f)
                horizontalLineToRelative(14f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                lineTo(22f, 24f)
                close()
                moveTo(4f, 22f)
                lineTo(20f, 22f)
                lineTo(20f, 3f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                lineTo(5f, 2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                lineTo(4f, 22f)
                close()
                moveTo(13f, 11f)
                curveToRelative(-0.11f, 2.56f, -0.61f, 4.23f, -0.98f, 4.83f)
                curveToRelative(-0.37f, -0.6f, -0.87f, -2.27f, -0.98f, -4.83f)
                horizontalLineToRelative(1.95f)
                close()
                moveTo(15.0f, 9f)
                horizontalLineToRelative(2.94f)
                curveToRelative(-0.35f, -2.06f, -1.75f, -3.76f, -3.63f, -4.54f)
                curveToRelative(0.48f, 1.52f, 0.65f, 3.38f, 0.7f, 4.54f)
                close()
                moveTo(11.05f, 9f)
                horizontalLineToRelative(1.95f)
                curveToRelative(-0.11f, -2.56f, -0.61f, -4.23f, -0.98f, -4.83f)
                curveToRelative(-0.37f, 0.6f, -0.87f, 2.27f, -0.98f, 4.83f)
                close()
                moveTo(9.75f, 4.46f)
                curveToRelative(-1.88f, 0.78f, -3.29f, 2.48f, -3.63f, 4.54f)
                horizontalLineToRelative(2.94f)
                curveToRelative(0.05f, -1.15f, 0.21f, -3.02f, 0.7f, -4.54f)
                close()
                moveTo(14.3f, 15.54f)
                curveToRelative(1.88f, -0.78f, 3.29f, -2.48f, 3.63f, -4.54f)
                horizontalLineToRelative(-2.94f)
                curveToRelative(-0.05f, 1.15f, -0.21f, 3.02f, -0.7f, 4.54f)
                close()
                moveTo(9.05f, 11f)
                horizontalLineToRelative(-2.94f)
                curveToRelative(0.35f, 2.06f, 1.75f, 3.76f, 3.63f, 4.54f)
                curveToRelative(-0.48f, -1.52f, -0.65f, -3.38f, -0.7f, -4.54f)
                close()
                moveTo(17f, 18f)
                lineTo(7f, 18f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _Passport = it}
