package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FighterJet: ImageVector? = null

val Icons.Sr.FighterJet: ImageVector
    get() = _FighterJet ?: UXIcon(name = "FighterJet") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.5f, 9f)
                lineTo(11f, 2f)
                horizontalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                reflectiveCurveToRelative(-2.35f, -0.02f, -2.44f, 0f)
                arcTo(3.04f, 3.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 3f)
                verticalLineTo(9f)
                horizontalLineTo(5f)
                lineTo(3.01f, 6.61f)
                arcTo(1.71f, 1.71f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 7.7f)
                verticalLineToRelative(8.6f)
                arcToRelative(1.71f, 1.71f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.01f, 1.09f)
                lineTo(5f, 15f)
                horizontalLineTo(8f)
                verticalLineToRelative(6f)
                arcToRelative(3.05f, 3.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.5f, 3f)
                curveToRelative(0.1f, 0.03f, 2.5f, 0f, 2.5f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2f)
                horizontalLineTo(11f)
                lineToRelative(4.5f, -7f)
                curveToRelative(3.96f, -0.29f, 8.5f, -0.67f, 8.5f, -3f)
                reflectiveCurveTo(19.46f, 9.28f, 15.5f, 9f)
                close()
            }
        }.also { _FighterJet = it}
