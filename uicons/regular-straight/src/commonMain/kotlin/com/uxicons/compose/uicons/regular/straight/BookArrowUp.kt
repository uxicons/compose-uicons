package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BookArrowUp: ImageVector? = null

val Icons.Rs.BookArrowUp: ImageVector
    get() = _BookArrowUp ?: UXIcon(name = "BookArrowUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 15.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(-2f)
                lineTo(18f, 15.0f)
                lineToRelative(-2.29f, 2.29f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(3.29f, -3.29f)
                curveToRelative(0.78f, -0.78f, 2.05f, -0.78f, 2.83f, 0f)
                lineToRelative(3.29f, 3.29f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-2.29f, -2.29f)
                close()
                moveTo(16f, 24f)
                lineTo(5f, 24f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                lineTo(2f, 3f)
                curveTo(2f, 1.35f, 3.35f, 0f, 5f, 0f)
                horizontalLineToRelative(15f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                lineTo(22f, 11.34f)
                lineToRelative(-0.17f, -0.17f)
                curveToRelative(-0.52f, -0.52f, -1.16f, -0.85f, -1.83f, -1.03f)
                lineTo(20f, 2f)
                lineTo(8f, 2f)
                lineTo(8f, 18f)
                horizontalLineToRelative(5.59f)
                lineToRelative(2f, 2f)
                lineTo(5f, 20f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(2f)
                close()
                moveTo(4f, 18.17f)
                curveToRelative(0.31f, -0.11f, 0.65f, -0.17f, 1f, -0.17f)
                horizontalLineToRelative(1f)
                lineTo(6f, 2f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(15.17f)
                close()
            }
        }.also { _BookArrowUp = it}
