package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareCode: ImageVector? = null

val Icons.Ss.SquareCode: ImageVector
    get() = _SquareCode ?: UXIcon(name = "SquareCode") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 0f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                lineTo(0f, 24f)
                lineTo(24f, 24f)
                lineTo(24f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(10.29f, 15.29f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-3.3f, -3.3f)
                curveToRelative(-0.38f, -0.38f, -0.58f, -0.88f, -0.58f, -1.41f)
                reflectiveCurveToRelative(0.21f, -1.03f, 0.58f, -1.41f)
                lineToRelative(3.3f, -3.3f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-3.3f, 3.3f)
                lineToRelative(3.3f, 3.28f)
                close()
                moveTo(18.42f, 13.41f)
                lineToRelative(-3.3f, 3.3f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(3.3f, -3.3f)
                lineToRelative(-3.3f, -3.28f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(3.3f, 3.3f)
                curveToRelative(0.38f, 0.38f, 0.58f, 0.88f, 0.58f, 1.41f)
                reflectiveCurveToRelative(-0.21f, 1.03f, -0.58f, 1.41f)
                close()
            }
        }.also { _SquareCode = it}
