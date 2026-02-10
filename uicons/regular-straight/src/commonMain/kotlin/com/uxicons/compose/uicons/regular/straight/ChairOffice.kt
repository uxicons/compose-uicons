package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChairOffice: ImageVector? = null

val Icons.Rs.ChairOffice: ImageVector
    get() = _ChairOffice ?: UXIcon(name = "ChairOffice") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 7f)
                horizontalLineToRelative(-1f)
                lineTo(19f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                lineTo(8f, 0f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                lineTo(5f, 7f)
                horizontalLineToRelative(-1f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(9f)
                lineTo(11f, 19f)
                verticalLineToRelative(3f)
                lineTo(6f, 22f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(10f)
                lineTo(23f, 10f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(20f, 9f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(3.17f)
                curveToRelative(-0.31f, -0.11f, -0.65f, -0.17f, -1f, -0.17f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(1f)
                close()
                moveTo(8f, 2f)
                horizontalLineToRelative(8f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                lineTo(17f, 13f)
                lineTo(7f, 13f)
                lineTo(7f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                close()
                moveTo(4f, 9f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.35f, 0f, -0.69f, 0.06f, -1f, 0.17f)
                verticalLineToRelative(-3.17f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                close()
                moveTo(21f, 17f)
                lineTo(3f, 17f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                lineTo(20f, 15f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(1f)
                close()
            }
        }.also { _ChairOffice = it}
