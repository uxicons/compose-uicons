package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FonduePot: ImageVector? = null

val Icons.Bs.FonduePot: ImageVector
    get() = _FonduePot ?: UXIcon(name = "FonduePot") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 7f)
                horizontalLineToRelative(-3.68f)
                lineToRelative(2.66f, -4.46f)
                lineToRelative(-2.58f, -1.53f)
                lineToRelative(-3.57f, 6.0f)
                horizontalLineToRelative(-1.96f)
                lineToRelative(1.44f, -6.28f)
                lineTo(13.38f, 0.05f)
                lineToRelative(-1.59f, 6.95f)
                horizontalLineToRelative(-4.63f)
                lineTo(3.6f, 1.0f)
                lineToRelative(-2.58f, 1.53f)
                lineToRelative(2.66f, 4.46f)
                lineTo(0f, 7.0f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2.5f)
                curveToRelative(0f, 2.62f, 1.19f, 4.97f, 3.07f, 6.53f)
                lineToRelative(-2.26f, 4.97f)
                horizontalLineToRelative(3.3f)
                lineToRelative(1.36f, -3f)
                horizontalLineToRelative(9.07f)
                lineToRelative(1.36f, 3f)
                horizontalLineToRelative(3.29f)
                lineToRelative(-2.26f, -4.97f)
                curveToRelative(1.87f, -1.56f, 3.07f, -3.91f, 3.07f, -6.53f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                close()
                moveTo(19f, 12.5f)
                curveToRelative(0f, 3.03f, -2.47f, 5.5f, -5.5f, 5.5f)
                horizontalLineToRelative(-3f)
                curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(2.5f)
                close()
            }
        }.also { _FonduePot = it}
