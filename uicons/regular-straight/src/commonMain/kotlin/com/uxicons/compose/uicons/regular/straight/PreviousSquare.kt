package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PreviousSquare: ImageVector? = null

val Icons.Rs.PreviousSquare: ImageVector
    get() = _PreviousSquare ?: UXIcon(name = "PreviousSquare") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 0f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                lineTo(0f, 24f)
                lineTo(24f, 24f)
                lineTo(24f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(22f, 22f)
                lineTo(2f, 22f)
                lineTo(2f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                lineTo(21f, 2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                lineTo(22f, 22f)
                close()
                moveTo(9f, 6.5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4.35f)
                lineToRelative(8f, 4.5f)
                lineTo(17f, 6.35f)
                lineToRelative(-8f, 4.5f)
                lineTo(9f, 6.5f)
                close()
                moveTo(15f, 9.77f)
                verticalLineToRelative(4.46f)
                lineToRelative(-3.96f, -2.23f)
                lineToRelative(3.96f, -2.23f)
                close()
            }
        }.also { _PreviousSquare = it}
