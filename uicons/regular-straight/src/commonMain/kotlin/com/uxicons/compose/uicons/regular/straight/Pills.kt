package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pills: ImageVector? = null

val Icons.Rs.Pills: ImageVector
    get() = _Pills ?: UXIcon(name = "Pills") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.5f, 11f)
                curveToRelative(-3.58f, 0f, -6.5f, 2.92f, -6.5f, 6.5f)
                reflectiveCurveToRelative(2.92f, 6.5f, 6.5f, 6.5f)
                reflectiveCurveToRelative(6.5f, -2.92f, 6.5f, -6.5f)
                reflectiveCurveToRelative(-2.92f, -6.5f, -6.5f, -6.5f)
                close()
                moveTo(17.5f, 13f)
                curveToRelative(0.88f, 0f, 1.7f, 0.25f, 2.39f, 0.69f)
                lineToRelative(-6.2f, 6.2f)
                curveToRelative(-0.44f, -0.69f, -0.69f, -1.51f, -0.69f, -2.39f)
                curveToRelative(0f, -2.48f, 2.02f, -4.5f, 4.5f, -4.5f)
                close()
                moveTo(17.5f, 22f)
                curveToRelative(-0.88f, 0f, -1.7f, -0.25f, -2.39f, -0.69f)
                lineToRelative(6.2f, -6.2f)
                curveToRelative(0.44f, 0.69f, 0.69f, 1.51f, 0.69f, 2.39f)
                curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
                close()
                moveTo(6.5f, 22f)
                curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(8.3f)
                curveToRelative(0.69f, -1.09f, 1.61f, -2.02f, 2.7f, -2.7f)
                verticalLineToRelative(-3.8f)
                curveToRelative(0f, -3.58f, -2.92f, -6.5f, -6.5f, -6.5f)
                reflectiveCurveTo(0f, 2.92f, 0f, 6.5f)
                verticalLineToRelative(11f)
                curveToRelative(0f, 3.58f, 2.92f, 6.5f, 6.5f, 6.5f)
                curveToRelative(1.57f, 0f, 3.02f, -0.56f, 4.14f, -1.49f)
                curveToRelative(-0.4f, -0.55f, -0.74f, -1.15f, -1.01f, -1.79f)
                curveToRelative(-0.81f, 0.79f, -1.92f, 1.28f, -3.13f, 1.28f)
                close()
                moveTo(2f, 6.5f)
                curveToRelative(0f, -2.48f, 2.02f, -4.5f, 4.5f, -4.5f)
                reflectiveCurveToRelative(4.5f, 2.02f, 4.5f, 4.5f)
                verticalLineToRelative(4.5f)
                lineTo(2f, 11f)
                verticalLineToRelative(-4.5f)
                close()
            }
        }.also { _Pills = it}
