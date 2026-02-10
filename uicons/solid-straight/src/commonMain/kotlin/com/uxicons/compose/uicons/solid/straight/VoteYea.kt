package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VoteYea: ImageVector? = null

val Icons.Ss.VoteYea: ImageVector
    get() = _VoteYea ?: UXIcon(name = "VoteYea") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 2f)
                lineTo(8f, 2f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(14f)
                lineTo(19f, 5f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(13f, 12.27f)
                curveToRelative(-0.47f, 0.47f, -1.1f, 0.73f, -1.77f, 0.73f)
                reflectiveCurveToRelative(-1.3f, -0.26f, -1.77f, -0.73f)
                lineToRelative(-1.94f, -1.94f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(1.94f, 1.94f)
                curveToRelative(0.13f, 0.13f, 0.28f, 0.15f, 0.35f, 0.15f)
                reflectiveCurveToRelative(0.23f, -0.02f, 0.35f, -0.15f)
                lineToRelative(3.94f, -3.94f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-3.94f, 3.94f)
                close()
                moveTo(24f, 15f)
                verticalLineToRelative(7f)
                lineTo(0f, 22f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                verticalLineToRelative(7f)
                lineTo(21f, 19f)
                verticalLineToRelative(-7f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
            }
        }.also { _VoteYea = it}
