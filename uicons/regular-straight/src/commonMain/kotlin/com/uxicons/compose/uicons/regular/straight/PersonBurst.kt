package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonBurst: ImageVector? = null

val Icons.Rs.PersonBurst: ImageVector
    get() = _PersonBurst ?: UXIcon(name = "PersonBurst") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.01f, 0.03f)
                lineToRelative(2.81f, 5.14f)
                curveToRelative(-0.58f, 0.49f, -1.06f, 1.09f, -1.38f, 1.79f)
                lineToRelative(-1.43f, -2.69f)
                lineToRelative(-1.65f, 3.1f)
                lineToRelative(-3.61f, -1.94f)
                lineToRelative(2.27f, 3.56f)
                lineToRelative(-3.13f, 1.54f)
                lineToRelative(2.9f, 1.28f)
                lineToRelative(-1.09f, 2.96f)
                lineToRelative(2.77f, -0.95f)
                lineToRelative(1.61f, 3.01f)
                lineToRelative(0.92f, -1.81f)
                verticalLineToRelative(4.39f)
                lineToRelative(-0.88f, 1.73f)
                lineToRelative(-2.61f, -4.88f)
                lineToRelative(-5.14f, 1.77f)
                lineToRelative(1.89f, -5.15f)
                lineTo(0.16f, 10.65f)
                lineToRelative(4.97f, -2.45f)
                lineTo(-0.06f, 0.05f)
                lineTo(8.54f, 4.67f)
                lineTo(11.01f, 0.03f)
                close()
                moveTo(19f, 5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(24f, 17f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(-2f)
                lineTo(14f, 9f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(4f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(8f)
                close()
                moveTo(22f, 9f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-6f)
                close()
            }
        }.also { _PersonBurst = it}
