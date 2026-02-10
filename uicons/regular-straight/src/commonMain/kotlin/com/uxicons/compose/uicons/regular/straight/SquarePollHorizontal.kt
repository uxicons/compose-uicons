package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquarePollHorizontal: ImageVector? = null

val Icons.Rs.SquarePollHorizontal: ImageVector
    get() = _SquarePollHorizontal ?: UXIcon(name = "SquarePollHorizontal") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 0f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                lineTo(0f, 24f)
                lineTo(24f, 24f)
                lineTo(24f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(22f, 22f)
                lineTo(2f, 22f)
                lineTo(2f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                lineTo(21f, 2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                lineTo(22f, 22f)
                close()
                moveTo(8f, 13f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(2f)
                lineTo(8f, 15f)
                verticalLineToRelative(-2f)
                close()
                moveTo(11f, 17f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(2f)
                lineTo(11f, 19f)
                verticalLineToRelative(-2f)
                close()
                moveTo(5f, 9f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(2f)
                lineTo(5f, 11f)
                verticalLineToRelative(-2f)
                close()
                moveTo(15f, 5f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _SquarePollHorizontal = it}
