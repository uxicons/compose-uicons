package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlusHexagon: ImageVector? = null

val Icons.Rs.PlusHexagon: ImageVector
    get() = _PlusHexagon ?: UXIcon(name = "PlusHexagon") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.64f, 10.55f)
                lineToRelative(-4.25f, -7.96f)
                curveToRelative(-0.52f, -0.98f, -1.54f, -1.59f, -2.65f, -1.59f)
                lineTo(7.28f, 1.0f)
                curveToRelative(-1.11f, 0f, -2.12f, 0.61f, -2.64f, 1.58f)
                lineTo(0.37f, 10.55f)
                curveToRelative(-0.49f, 0.91f, -0.49f, 2f, 0f, 2.91f)
                lineToRelative(4.27f, 7.96f)
                curveToRelative(0.52f, 0.97f, 1.54f, 1.58f, 2.64f, 1.58f)
                horizontalLineToRelative(9.46f)
                curveToRelative(1.11f, 0f, 2.12f, -0.61f, 2.65f, -1.59f)
                lineToRelative(4.25f, -7.96f)
                curveToRelative(0.48f, -0.91f, 0.48f, -1.99f, 0f, -2.9f)
                close()
                moveTo(21.87f, 12.51f)
                lineToRelative(-4.25f, 7.96f)
                curveToRelative(-0.17f, 0.33f, -0.51f, 0.53f, -0.88f, 0.53f)
                lineTo(7.28f, 21f)
                curveToRelative(-0.37f, 0f, -0.71f, -0.2f, -0.88f, -0.53f)
                lineToRelative(-4.27f, -7.96f)
                curveToRelative(-0.17f, -0.32f, -0.17f, -0.7f, 0f, -1.02f)
                lineTo(6.4f, 3.53f)
                curveToRelative(0.17f, -0.33f, 0.51f, -0.53f, 0.88f, -0.53f)
                horizontalLineToRelative(9.46f)
                curveToRelative(0.37f, 0f, 0.71f, 0.2f, 0.88f, 0.53f)
                lineToRelative(4.25f, 7.96f)
                curveToRelative(0.17f, 0.32f, 0.17f, 0.7f, 0f, 1.01f)
                close()
                moveTo(13f, 11f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                close()
            }
        }.also { _PlusHexagon = it}
