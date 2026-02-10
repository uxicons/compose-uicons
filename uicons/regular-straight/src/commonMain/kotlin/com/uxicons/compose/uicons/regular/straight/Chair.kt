package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Chair: ImageVector? = null

val Icons.Rs.Chair: ImageVector
    get() = _Chair ?: UXIcon(name = "Chair") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 13f)
                lineTo(19f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                lineTo(8f, 0f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                lineTo(5f, 13f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-5f)
                lineTo(20f, 19f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-8f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(17f, 3f)
                lineTo(17f, 13f)
                horizontalLineToRelative(-2f)
                lineTo(15f, 2f)
                horizontalLineToRelative(1f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(11f, 13f)
                lineTo(11f, 2f)
                horizontalLineToRelative(2f)
                lineTo(13f, 13f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(7f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(1f)
                lineTo(9f, 13f)
                horizontalLineToRelative(-2f)
                lineTo(7f, 3f)
                close()
                moveTo(4f, 17f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(14f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(1f)
                lineTo(4f, 17f)
                close()
            }
        }.also { _Chair = it}
