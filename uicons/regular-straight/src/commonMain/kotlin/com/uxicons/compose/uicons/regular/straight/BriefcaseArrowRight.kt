package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BriefcaseArrowRight: ImageVector? = null

val Icons.Rs.BriefcaseArrowRight: ImageVector
    get() = _BriefcaseArrowRight ?: UXIcon(name = "BriefcaseArrowRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.41f, 12.59f)
                curveToRelative(0.78f, 0.78f, 0.78f, 2.05f, 0f, 2.83f)
                lineToRelative(-4.24f, 4.24f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(3.24f, -3.24f)
                lineTo(6f, 15.01f)
                verticalLineToRelative(-2f)
                lineTo(15f, 13.01f)
                lineToRelative(-3.24f, -3.24f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(4.24f, 4.24f)
                close()
                moveTo(24f, 7f)
                lineTo(24f, 24f)
                lineTo(0f, 24f)
                lineTo(0f, 7f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(3f)
                lineTo(6f, 2f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(8f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(8f, 4f)
                horizontalLineToRelative(8f)
                lineTo(16f, 2f)
                lineTo(8f, 2f)
                verticalLineToRelative(2f)
                close()
                moveTo(22f, 7f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                lineTo(3f, 6f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(15f)
                lineTo(22f, 22f)
                lineTo(22f, 7f)
                close()
            }
        }.also { _BriefcaseArrowRight = it}
