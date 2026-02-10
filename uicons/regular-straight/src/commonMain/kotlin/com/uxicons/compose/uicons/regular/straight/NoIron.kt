package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NoIron: ImageVector? = null

val Icons.Rs.NoIron: ImageVector
    get() = _NoIron ?: UXIcon(name = "NoIron") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.76f, 20f)
                lineToRelative(2f, 2f)
                lineTo(0f, 22f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -4.12f, 2.39f, -7.68f, 5.86f, -9.4f)
                lineToRelative(1.51f, 1.51f)
                curveToRelative(-3.14f, 1.25f, -5.37f, 4.32f, -5.37f, 7.89f)
                verticalLineToRelative(0.5f)
                lineTo(15.76f, 20f)
                close()
                moveTo(24.02f, 22.48f)
                lineToRelative(-1.48f, 1.48f)
                lineTo(0.04f, 1.46f)
                lineTo(1.46f, 0.04f)
                lineTo(10.41f, 9f)
                horizontalLineToRelative(11.59f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                lineTo(8f, 4f)
                lineTo(8f, 2f)
                horizontalLineToRelative(10f)
                curveToRelative(3.31f, 0f, 6f, 2.69f, 6f, 6f)
                lineToRelative(0.02f, 14.48f)
                close()
                moveTo(22f, 11f)
                lineTo(12.41f, 11f)
                lineToRelative(9f, 9f)
                horizontalLineToRelative(0.59f)
                lineTo(22f, 11f)
                close()
            }
        }.also { _NoIron = it}
