package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Token: ImageVector? = null

val Icons.Rs.Token: ImageVector
    get() = _Token ?: UXIcon(name = "Token") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-5.51f, 0f, -10f, -4.49f, -10f, -10f)
                reflectiveCurveTo(6.49f, 2f, 12f, 2f)
                reflectiveCurveToRelative(10f, 4.49f, 10f, 10f)
                reflectiveCurveToRelative(-4.49f, 10f, -10f, 10f)
                close()
                moveTo(16.48f, 10.5f)
                verticalLineToRelative(0.69f)
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
                close()
                moveTo(12f, 4f)
                curveToRelative(-4.41f, 0f, -8f, 3.59f, -8f, 8f)
                reflectiveCurveToRelative(3.59f, 8f, 8f, 8f)
                reflectiveCurveToRelative(8f, -3.59f, 8f, -8f)
                reflectiveCurveToRelative(-3.59f, -8f, -8f, -8f)
                close()
                moveTo(12f, 18f)
                curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                reflectiveCurveToRelative(2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
                close()
            }
        }.also { _Token = it}
