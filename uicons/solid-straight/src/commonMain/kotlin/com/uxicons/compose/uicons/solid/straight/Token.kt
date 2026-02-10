package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Token: ImageVector? = null

val Icons.Ss.Token: ImageVector
    get() = _Token ?: UXIcon(name = "Token") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 21f)
                curveToRelative(-4.96f, 0f, -9f, -4.04f, -9f, -9f)
                reflectiveCurveTo(7.04f, 3f, 12f, 3f)
                reflectiveCurveToRelative(9f, 4.04f, 9f, 9f)
                reflectiveCurveToRelative(-4.04f, 9f, -9f, 9f)
                close()
                moveTo(12f, 5f)
                curveToRelative(-3.86f, 0f, -7f, 3.14f, -7f, 7f)
                reflectiveCurveToRelative(3.14f, 7f, 7f, 7f)
                reflectiveCurveToRelative(7f, -3.14f, 7f, -7f)
                reflectiveCurveToRelative(-3.14f, -7f, -7f, -7f)
                close()
                moveTo(16.48f, 11.19f)
                lineToRelative(-2.47f, 1.43f)
                lineToRelative(0.99f, 3.01f)
                lineToRelative(-0.56f, 0.39f)
                lineToRelative(-2.44f, -1.88f)
                lineToRelative(-2.44f, 1.89f)
                horizontalLineToRelative(-0.01f)
                lineToRelative(-0.54f, -0.4f)
                lineToRelative(0.97f, -3.05f)
                lineToRelative(-2.48f, -1.38f)
                verticalLineToRelative(-0.69f)
                horizontalLineToRelative(3.25f)
                lineToRelative(0.88f, -3.37f)
                horizontalLineToRelative(0.72f)
                lineToRelative(0.88f, 3.37f)
                horizontalLineToRelative(3.24f)
                verticalLineToRelative(0.69f)
                close()
            }
        }.also { _Token = it}
