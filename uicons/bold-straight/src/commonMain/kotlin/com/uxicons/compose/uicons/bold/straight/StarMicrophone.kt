package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _StarMicrophone: ImageVector? = null

val Icons.Bs.StarMicrophone: ImageVector
    get() = _StarMicrophone ?: UXIcon(name = "StarMicrophone") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.5f, 20f)
                horizontalLineToRelative(2.27f)
                lineToRelative(-0.85f, 3f)
                horizontalLineToRelative(-1.42f)
                curveToRelative(-5.79f, 0f, -10.5f, -4.71f, -10.5f, -10.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 4.14f, 3.36f, 7.5f, 7.5f, 7.5f)
                close()
                moveTo(19.83f, 16.36f)
                lineTo(18.54f, 12f)
                horizontalLineToRelative(-1.06f)
                lineToRelative(-1.28f, 4.36f)
                horizontalLineToRelative(-4.2f)
                verticalLineToRelative(1.01f)
                lineToRelative(3.08f, 2.02f)
                lineToRelative(-1.18f, 4.02f)
                lineToRelative(0.79f, 0.59f)
                lineToRelative(3.33f, -2.34f)
                lineToRelative(3.38f, 2.34f)
                lineToRelative(0.82f, -0.57f)
                lineToRelative(-1.27f, -3.98f)
                lineToRelative(3.05f, -2.08f)
                horizontalLineToRelative(0.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(10f, 17.69f)
                verticalLineToRelative(-3.26f)
                curveToRelative(-1.19f, -0.69f, -2f, -1.96f, -2f, -3.43f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -3.86f, -3.14f, -7f, -7f, -7f)
                reflectiveCurveToRelative(-7f, 3.14f, -7f, 7f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 3.16f, 2.11f, 5.83f, 5f, 6.69f)
                close()
            }
        }.also { _StarMicrophone = it}
