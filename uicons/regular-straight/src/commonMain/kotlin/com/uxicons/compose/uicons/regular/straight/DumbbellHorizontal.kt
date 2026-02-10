package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DumbbellHorizontal: ImageVector? = null

val Icons.Rs.DumbbellHorizontal: ImageVector
    get() = _DumbbellHorizontal ?: UXIcon(name = "DumbbellHorizontal") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 11f)
                horizontalLineToRelative(-2f)
                lineTo(22f, 6f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-3f)
                lineTo(16f, 11f)
                lineTo(8f, 11f)
                lineTo(8f, 3f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(5f)
                lineTo(0f, 11f)
                verticalLineToRelative(2f)
                lineTo(2f, 13f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(3f)
                lineTo(8f, 13f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(3f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                close()
                moveTo(6f, 19f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                lineTo(4f, 6f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(14f)
                close()
                moveTo(20f, 18f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-1f)
                lineTo(18f, 5f)
                horizontalLineToRelative(1f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(12f)
                close()
            }
        }.also { _DumbbellHorizontal = it}
