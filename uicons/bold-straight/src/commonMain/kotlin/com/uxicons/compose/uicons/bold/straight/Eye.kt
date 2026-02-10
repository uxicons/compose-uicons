package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Eye: ImageVector? = null

val Icons.Bs.Eye: ImageVector
    get() = _Eye ?: UXIcon(name = "Eye") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.8f, 11.48f)
                curveToRelative(-0.13f, -0.35f, -3.3f, -8.54f, -11.8f, -8.54f)
                reflectiveCurveTo(0.33f, 11.13f, 0.2f, 11.48f)
                lineTo(0f, 12f)
                lineToRelative(0.2f, 0.52f)
                curveToRelative(0.13f, 0.35f, 3.3f, 8.54f, 11.8f, 8.54f)
                reflectiveCurveToRelative(11.67f, -8.19f, 11.8f, -8.54f)
                lineTo(24f, 12f)
                close()
                moveTo(12f, 18.09f)
                curveToRelative(-5.42f, 0f, -8.04f, -4.51f, -8.79f, -6.08f)
                curveTo(3.96f, 10.43f, 6.58f, 5.92f, 12f, 5.92f)
                reflectiveCurveTo(20.04f, 10.42f, 20.79f, 12f)
                curveTo(20.04f, 13.58f, 17.41f, 18.09f, 12f, 18.09f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 12f)
                moveToRelative(-4f, 0f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = true, 8f, 0f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = true, -8f, 0f)
            }
        }.also { _Eye = it}
