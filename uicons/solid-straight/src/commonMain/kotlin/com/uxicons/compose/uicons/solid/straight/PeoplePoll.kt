package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PeoplePoll: ImageVector? = null

val Icons.Ss.PeoplePoll: ImageVector
    get() = _PeoplePoll ?: UXIcon(name = "PeoplePoll") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 15f)
                lineTo(12f, 15f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(9f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(22f, 19f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(5f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(1f)
                close()
                moveTo(21f, 2f)
                lineTo(12f, 2f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(9f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(22f, 6f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(1f)
                close()
                moveTo(4f, 6f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                reflectiveCurveTo(5.65f, 0f, 4f, 0f)
                reflectiveCurveTo(1f, 1.35f, 1f, 3f)
                reflectiveCurveToRelative(1.35f, 3f, 3f, 3f)
                close()
                moveTo(8f, 10f)
                verticalLineToRelative(1f)
                lineTo(0f, 11f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(2f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(7f, 16f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.35f, -3f, 3f)
                reflectiveCurveToRelative(1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                close()
                moveTo(8f, 23f)
                verticalLineToRelative(1f)
                lineTo(0f, 24f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(2f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
            }
        }.also { _PeoplePoll = it}
