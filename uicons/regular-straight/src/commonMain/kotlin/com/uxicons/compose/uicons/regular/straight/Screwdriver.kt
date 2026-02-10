package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Screwdriver: ImageVector? = null

val Icons.Rs.Screwdriver: ImageVector
    get() = _Screwdriver ?: UXIcon(name = "Screwdriver") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.58f, 9f)
                lineToRelative(3.4f, -5.89f)
                lineTo(20.89f, 0.03f)
                lineToRelative(-5.89f, 3.4f)
                verticalLineToRelative(4.16f)
                lineToRelative(-5.01f, 5.01f)
                lineToRelative(-1.41f, -1.4f)
                lineTo(0.9f, 18.88f)
                curveToRelative(-1.17f, 1.17f, -1.17f, 3.07f, 0f, 4.24f)
                curveToRelative(0.57f, 0.57f, 1.32f, 0.88f, 2.12f, 0.88f)
                reflectiveCurveToRelative(1.55f, -0.31f, 2.12f, -0.88f)
                lineToRelative(7.7f, -7.7f)
                lineToRelative(-1.43f, -1.42f)
                lineToRelative(5.0f, -5.0f)
                horizontalLineToRelative(4.16f)
                close()
                moveTo(3.73f, 21.71f)
                curveToRelative(-0.38f, 0.38f, -1.04f, 0.38f, -1.41f, 0f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(6.27f, -6.27f)
                lineToRelative(1.42f, 1.41f)
                lineToRelative(-6.28f, 6.28f)
                close()
                moveTo(17f, 4.58f)
                lineToRelative(3.56f, -2.05f)
                lineToRelative(0.92f, 0.92f)
                lineToRelative(-2.05f, 3.56f)
                horizontalLineToRelative(-2.42f)
                verticalLineToRelative(-2.42f)
                close()
            }
        }.also { _Screwdriver = it}
