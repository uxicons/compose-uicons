package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FighterJet: ImageVector? = null

val Icons.Br.FighterJet: ImageVector
    get() = _FighterJet ?: UXIcon(name = "FighterJet") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15.84f, 8.08f)
            lineTo(12.47f, 3f)
            horizontalLineTo(12.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3f)
            horizontalLineToRelative(-2f)
            arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 3.5f)
            verticalLineTo(8f)
            horizontalLineTo(3.72f)
            lineToRelative(-0.59f, -0.93f)
            curveTo(2.5f, 5.94f, 0.12f, 5.38f, 0f, 7.13f)
            verticalLineToRelative(9.75f)
            arcTo(1.13f, 1.13f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.13f, 18f)
            horizontalLineToRelative(0.02f)
            arcToRelative(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.01f, -1.08f)
            lineTo(3.73f, 16f)
            horizontalLineTo(7f)
            verticalLineToRelative(4.5f)
            arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.5f, 24f)
            horizontalLineToRelative(2f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3f)
            horizontalLineToRelative(-0.03f)
            lineToRelative(3.37f, -5.05f)
            curveTo(26.77f, 15.3f, 26.77f, 8.69f, 15.84f, 8.08f)
            close()
            moveTo(14.9f, 13.01f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.15f, 0.66f)
            lineTo(10f, 19.3f)
            verticalLineTo(14.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.5f, 13f)
            horizontalLineTo(4f)
            verticalLineTo(11f)
            horizontalLineTo(8.5f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 9.5f)
            verticalLineTo(4.71f)
            lineToRelative(3.75f, 5.64f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.15f, 0.67f)
            arcTo(22.42f, 22.42f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.42f, 12f)
            arcTo(22.5f, 22.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.9f, 13.01f)
            close()
        }
    }.also { _FighterJet = it }
