package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _StarChristmas: ImageVector? = null

val Icons.Rr.StarChristmas: ImageVector
    get() = _StarChristmas ?: UXIcon(name = "StarChristmas") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.99f, 10.49f)
                lineToRelative(-4.57f, -1.88f)
                lineToRelative(3.41f, -5.12f)
                curveToRelative(0.57f, -0.87f, -0.46f, -1.89f, -1.32f, -1.32f)
                lineToRelative(-5.12f, 3.4f)
                lineToRelative(-1.87f, -4.55f)
                curveToRelative(-0.25f, -0.61f, -0.85f, -1.01f, -1.51f, -1.01f)
                reflectiveCurveToRelative(-1.26f, 0.4f, -1.51f, 1.01f)
                lineToRelative(-1.87f, 4.55f)
                lineTo(3.49f, 2.17f)
                curveToRelative(-0.87f, -0.57f, -1.89f, 0.46f, -1.32f, 1.32f)
                lineToRelative(3.41f, 5.12f)
                lineToRelative(-4.57f, 1.88f)
                curveToRelative(-0.62f, 0.25f, -1.01f, 0.85f, -1.01f, 1.51f)
                reflectiveCurveToRelative(0.4f, 1.26f, 1.01f, 1.51f)
                lineToRelative(4.56f, 1.88f)
                lineToRelative(-3.41f, 5.11f)
                curveToRelative(-0.57f, 0.87f, 0.46f, 1.89f, 1.32f, 1.32f)
                lineToRelative(5.12f, -3.4f)
                lineToRelative(1.88f, 4.56f)
                curveToRelative(0.25f, 0.61f, 0.85f, 1.01f, 1.51f, 1.01f)
                reflectiveCurveToRelative(1.26f, -0.4f, 1.51f, -1.01f)
                lineToRelative(1.88f, -4.56f)
                lineToRelative(5.12f, 3.4f)
                curveToRelative(0.87f, 0.57f, 1.89f, -0.46f, 1.32f, -1.32f)
                lineToRelative(-3.41f, -5.11f)
                lineToRelative(4.56f, -1.88f)
                curveToRelative(0.62f, -0.25f, 1.01f, -0.85f, 1.01f, -1.51f)
                reflectiveCurveToRelative(-0.4f, -1.26f, -1.01f, -1.51f)
                close()
                moveTo(15.13f, 14.59f)
                curveToRelative(-0.25f, 0.1f, -0.44f, 0.3f, -0.54f, 0.54f)
                lineToRelative(-2.58f, 6.28f)
                lineToRelative(-2.58f, -6.28f)
                curveToRelative(-0.1f, -0.25f, -0.3f, -0.44f, -0.54f, -0.54f)
                lineToRelative(-6.28f, -2.58f)
                lineToRelative(6.28f, -2.58f)
                curveToRelative(0.25f, -0.1f, 0.44f, -0.3f, 0.54f, -0.54f)
                lineToRelative(2.58f, -6.28f)
                lineToRelative(2.58f, 6.28f)
                curveToRelative(0.1f, 0.25f, 0.3f, 0.44f, 0.54f, 0.54f)
                lineToRelative(6.28f, 2.58f)
                lineToRelative(-6.28f, 2.58f)
                close()
            }
        }.also { _StarChristmas = it}
