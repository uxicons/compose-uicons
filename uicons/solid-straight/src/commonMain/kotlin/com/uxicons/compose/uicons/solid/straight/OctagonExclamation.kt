package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _OctagonExclamation: ImageVector? = null

val Icons.Ss.OctagonExclamation: ImageVector
    get() = _OctagonExclamation ?: UXIcon(name = "OctagonExclamation") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.12f, 6.15f)
                lineTo(17.85f, 0.88f)
                curveToRelative(-0.57f, -0.57f, -1.32f, -0.88f, -2.12f, -0.88f)
                horizontalLineToRelative(-7.46f)
                curveToRelative(-0.8f, 0f, -1.55f, 0.31f, -2.12f, 0.88f)
                lineTo(0.88f, 6.15f)
                curveToRelative(-0.57f, 0.57f, -0.88f, 1.32f, -0.88f, 2.12f)
                verticalLineToRelative(7.46f)
                curveToRelative(0f, 0.8f, 0.31f, 1.55f, 0.88f, 2.12f)
                lineToRelative(5.27f, 5.27f)
                curveToRelative(0.57f, 0.57f, 1.32f, 0.88f, 2.12f, 0.88f)
                horizontalLineToRelative(7.46f)
                curveToRelative(0.8f, 0f, 1.55f, -0.31f, 2.12f, -0.88f)
                lineToRelative(5.27f, -5.27f)
                curveToRelative(0.57f, -0.57f, 0.88f, -1.32f, 0.88f, -2.12f)
                verticalLineToRelative(-7.46f)
                curveToRelative(0f, -0.8f, -0.31f, -1.55f, -0.88f, -2.12f)
                close()
                moveTo(11f, 6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-7f)
                close()
                moveTo(12f, 18f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _OctagonExclamation = it}
