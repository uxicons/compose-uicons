package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DownFromBracket: ImageVector? = null

val Icons.Rs.DownFromBracket: ImageVector
    get() = _DownFromBracket ?: UXIcon(name = "DownFromBracket") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 5f)
                lineTo(7f, 5f)
                lineTo(7f, 13f)
                lineTo(0.07f, 13f)
                lineToRelative(9.79f, 10.11f)
                lineToRelative(0.01f, 0.01f)
                curveToRelative(0.57f, 0.57f, 1.32f, 0.89f, 2.13f, 0.89f)
                horizontalLineToRelative(0f)
                curveToRelative(0.8f, 0f, 1.56f, -0.31f, 2.13f, -0.89f)
                lineToRelative(9.81f, -10.11f)
                horizontalLineToRelative(-6.95f)
                lineTo(17.0f, 5f)
                close()
                moveTo(19.22f, 15f)
                lineToRelative(-6.51f, 6.71f)
                curveToRelative(-0.19f, 0.19f, -0.44f, 0.29f, -0.71f, 0.29f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.27f, 0f, -0.52f, -0.1f, -0.7f, -0.29f)
                lineToRelative(-6.5f, -6.71f)
                horizontalLineToRelative(4.21f)
                lineTo(9.0f, 7f)
                horizontalLineToRelative(6f)
                lineTo(15.0f, 15f)
                horizontalLineToRelative(4.22f)
                close()
                moveTo(24f, 3f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-2f)
                lineTo(22f, 3f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                lineTo(3f, 2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(6f)
                lineTo(0f, 9f)
                lineTo(0f, 3f)
                curveTo(0f, 1.35f, 1.35f, 0f, 3f, 0f)
                lineTo(21f, 0f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
            }
        }.also { _DownFromBracket = it}
