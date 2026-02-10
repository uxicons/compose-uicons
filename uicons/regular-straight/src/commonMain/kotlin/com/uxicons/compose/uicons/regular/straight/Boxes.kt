package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Boxes: ImageVector? = null

val Icons.Rs.Boxes: ImageVector
    get() = _Boxes ?: UXIcon(name = "Boxes") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.5f, 15f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2f)
                close()
                moveTo(24f, 14f)
                verticalLineToRelative(10f)
                lineTo(0f, 24f)
                lineTo(0f, 14f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(2f)
                lineTo(5f, 3f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(8f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                lineTo(19f, 11f)
                horizontalLineToRelative(2f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(7f, 11f)
                horizontalLineToRelative(10f)
                lineTo(17f, 3f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                lineTo(8f, 2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                lineTo(7f, 11f)
                close()
                moveTo(2f, 22f)
                lineTo(11f, 22f)
                lineTo(11f, 13f)
                lineTo(3f, 13f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(8f)
                close()
                moveTo(22f, 14f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                lineTo(13f, 13f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(9f)
                lineTo(22f, 14f)
                close()
                moveTo(4.5f, 15f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-2f)
                lineTo(4.5f, 15f)
                close()
                moveTo(10f, 6f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _Boxes = it}
