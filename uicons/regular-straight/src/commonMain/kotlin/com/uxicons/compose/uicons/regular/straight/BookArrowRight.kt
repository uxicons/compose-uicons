package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BookArrowRight: ImageVector? = null

val Icons.Rs.BookArrowRight: ImageVector
    get() = _BookArrowRight ?: UXIcon(name = "BookArrowRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.0f, 11f)
                lineTo(12f, 11f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(9.0f)
                lineToRelative(-2.29f, -2.29f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(3.29f, 3.29f)
                curveToRelative(0.78f, 0.78f, 0.78f, 2.05f, 0f, 2.83f)
                lineToRelative(-3.29f, 3.29f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(2.29f, -2.29f)
                close()
                moveTo(18f, 16f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(8f)
                lineTo(3f, 24f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                lineTo(0f, 3f)
                curveTo(0f, 1.35f, 1.35f, 0f, 3f, 0f)
                horizontalLineToRelative(15f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                lineTo(18f, 2f)
                lineTo(6f, 2f)
                lineTo(6f, 18f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-2f)
                close()
                moveTo(2f, 3f)
                verticalLineToRelative(15.17f)
                curveToRelative(0.31f, -0.11f, 0.65f, -0.17f, 1f, -0.17f)
                horizontalLineToRelative(1f)
                lineTo(4f, 2f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                close()
                moveTo(18f, 22f)
                verticalLineToRelative(-2f)
                lineTo(3f, 20f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(15f)
                close()
            }
        }.also { _BookArrowRight = it}
