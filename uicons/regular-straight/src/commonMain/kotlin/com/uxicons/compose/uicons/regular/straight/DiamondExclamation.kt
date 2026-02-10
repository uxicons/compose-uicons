package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiamondExclamation: ImageVector? = null

val Icons.Rs.DiamondExclamation: ImageVector
    get() = _DiamondExclamation ?: UXIcon(name = "DiamondExclamation") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.16f, 9.87f)
                lineTo(14.12f, 0.83f)
                curveToRelative(-1.13f, -1.13f, -3.11f, -1.13f, -4.24f, 0f)
                lineTo(0.84f, 9.87f)
                curveToRelative(-1.17f, 1.17f, -1.17f, 3.07f, 0f, 4.24f)
                lineToRelative(9.04f, 9.04f)
                curveToRelative(0.57f, 0.57f, 1.32f, 0.88f, 2.12f, 0.88f)
                reflectiveCurveToRelative(1.55f, -0.31f, 2.12f, -0.88f)
                lineToRelative(9.04f, -9.04f)
                curveToRelative(1.17f, -1.17f, 1.17f, -3.07f, 0f, -4.24f)
                close()
                moveTo(21.75f, 12.7f)
                lineToRelative(-9.04f, 9.04f)
                curveToRelative(-0.38f, 0.38f, -1.04f, 0.38f, -1.41f, 0f)
                lineTo(2.25f, 12.7f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.42f)
                lineTo(11.29f, 2.25f)
                curveToRelative(0.38f, -0.38f, 1.04f, -0.38f, 1.41f, 0f)
                lineToRelative(9.04f, 9.04f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.42f)
                close()
                moveTo(11f, 16f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                close()
                moveTo(11f, 6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-2f)
                lineTo(11f, 6f)
                close()
            }
        }.also { _DiamondExclamation = it}
