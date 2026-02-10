package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FighterJet: ImageVector? = null

val Icons.Ss.FighterJet: ImageVector
    get() = _FighterJet ?: UXIcon(name = "FighterJet") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 9f)
                lineTo(10f, 2f)
                horizontalLineToRelative(3f)
                verticalLineTo(0f)
                horizontalLineTo(7f)
                verticalLineTo(9f)
                horizontalLineTo(4f)
                lineTo(2.9f, 7.34f)
                curveTo(2.35f, 6.5f, 2f, 6f, 0.99f, 6f)
                horizontalLineTo(0f)
                verticalLineTo(18f)
                horizontalLineTo(0.41f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.5f, -1.35f)
                lineTo(4f, 15f)
                horizontalLineTo(7f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(6f)
                verticalLineTo(22f)
                horizontalLineTo(10f)
                lineToRelative(5f, -7f)
                curveToRelative(3.96f, -0.29f, 9f, -0.67f, 9f, -3f)
                reflectiveCurveTo(18.96f, 9.28f, 15f, 9f)
                close()
            }
        }.also { _FighterJet = it}
