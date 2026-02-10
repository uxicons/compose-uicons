package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BuildAlt: ImageVector? = null

val Icons.Rs.BuildAlt: ImageVector
    get() = _BuildAlt ?: UXIcon(name = "BuildAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 0f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(11f)
                lineTo(24f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(22f, 6f)
                horizontalLineToRelative(-7f)
                lineTo(15f, 2f)
                horizontalLineToRelative(6f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(3f)
                close()
                moveTo(8f, 4f)
                lineTo(3f, 4f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(17f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-14f)
                lineTo(8f, 10f)
                verticalLineToRelative(-6f)
                close()
                moveTo(2f, 7f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(4f)
                lineTo(2f, 10f)
                verticalLineToRelative(-3f)
                close()
                moveTo(2f, 18f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                lineTo(2f, 22f)
                verticalLineToRelative(-4f)
                close()
                moveTo(16f, 18f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(8f)
                close()
                moveTo(18f, 22f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-4f)
                close()
                moveTo(22f, 16f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(4f)
                close()
                moveTo(11f, 12f)
                verticalLineToRelative(4f)
                lineTo(2f, 16f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(9f)
                close()
            }
        }.also { _BuildAlt = it}
