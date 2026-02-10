package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CandlePoseYoga: ImageVector? = null

val Icons.Rs.CandlePoseYoga: ImageVector
    get() = _CandlePoseYoga ?: UXIcon(name = "CandlePoseYoga") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.41f, 11.79f)
                curveToRelative(-0.15f, -0.76f, -0.3f, -1.23f, -0.41f, -1.51f)
                lineTo(14f, 0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(9.88f)
                lineToRelative(-1.11f, 0.55f)
                curveToRelative(-1.17f, 0.58f, -1.89f, 1.76f, -1.89f, 3.06f)
                verticalLineToRelative(8.5f)
                horizontalLineToRelative(-2.88f)
                lineToRelative(1.8f, -4.1f)
                lineToRelative(-1.83f, -0.8f)
                lineToRelative(-2.56f, 5.84f)
                lineToRelative(1.06f, 1.06f)
                horizontalLineToRelative(10.41f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -3.04f, -0.1f, -5.25f, -0.27f, -6.82f)
                curveToRelative(-0.08f, -0.65f, -0.18f, -1.29f, -0.31f, -1.89f)
                close()
                moveTo(13f, 22f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-8.5f)
                curveToRelative(0f, -0.54f, 0.3f, -1.03f, 0.79f, -1.27f)
                lineToRelative(0.61f, -0.3f)
                curveToRelative(0.04f, 0.18f, 0.09f, 0.37f, 0.12f, 0.56f)
                curveToRelative(0.23f, 1.33f, 0.48f, 3.75f, 0.48f, 8.01f)
                verticalLineToRelative(1.5f)
                close()
                moveTo(21f, 21.5f)
                curveToRelative(0f, 1.38f, -1.14f, 2.5f, -2.54f, 2.5f)
                reflectiveCurveToRelative(-2.46f, -1.12f, -2.46f, -2.5f)
                reflectiveCurveToRelative(1.05f, -2.5f, 2.46f, -2.5f)
                reflectiveCurveToRelative(2.54f, 1.12f, 2.54f, 2.5f)
                close()
            }
        }.also { _CandlePoseYoga = it}
