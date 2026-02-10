package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Clapperboard: ImageVector? = null

val Icons.Rs.Clapperboard: ImageVector
    get() = _Clapperboard ?: UXIcon(name = "Clapperboard") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 1f)
                lineTo(3f, 1f)
                curveTo(1.35f, 1f, 0f, 2.35f, 0f, 4f)
                verticalLineToRelative(19f)
                horizontalLineToRelative(24f)
                lineTo(24f, 4f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(11.79f, 7f)
                lineToRelative(4f, -4f)
                horizontalLineToRelative(3.42f)
                lineToRelative(-4f, 4f)
                horizontalLineToRelative(-3.42f)
                close()
                moveTo(5.54f, 7f)
                lineToRelative(4f, -4f)
                horizontalLineToRelative(3.42f)
                lineToRelative(-4f, 4f)
                horizontalLineToRelative(-3.42f)
                close()
                moveTo(21.73f, 3.31f)
                curveToRelative(0.17f, 0.18f, 0.27f, 0.42f, 0.27f, 0.69f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3.96f)
                lineToRelative(3.69f, -3.69f)
                close()
                moveTo(3f, 3f)
                horizontalLineToRelative(3.71f)
                lineTo(2.71f, 7f)
                horizontalLineToRelative(-0.71f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                close()
                moveTo(2f, 21f)
                verticalLineToRelative(-12f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(12f)
                lineTo(2f, 21f)
                close()
            }
        }.also { _Clapperboard = it}
