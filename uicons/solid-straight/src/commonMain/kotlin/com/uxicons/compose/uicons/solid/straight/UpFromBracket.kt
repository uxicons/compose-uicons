package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UpFromBracket: ImageVector? = null

val Icons.Ss.UpFromBracket: ImageVector
    get() = _UpFromBracket ?: UXIcon(name = "UpFromBracket") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 19f)
                horizontalLineToRelative(10f)
                lineTo(17f, 11f)
                horizontalLineToRelative(6.95f)
                lineTo(14.13f, 0.88f)
                curveToRelative(-0.57f, -0.57f, -1.32f, -0.88f, -2.12f, -0.88f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.8f, 0f, -1.56f, 0.31f, -2.13f, 0.89f)
                lineTo(0.07f, 11f)
                lineTo(7f, 11f)
                verticalLineToRelative(8f)
                close()
                moveTo(24f, 15f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                lineTo(3f, 24f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-6f)
                lineTo(2f, 15f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                lineTo(21f, 22f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(2f)
                close()
            }
        }.also { _UpFromBracket = it}
