package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowUpFromSquare: ImageVector? = null

val Icons.Rr.ArrowUpFromSquare: ImageVector
    get() = _ArrowUpFromSquare ?: UXIcon(name = "ArrowUpFromSquare") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.28f, 6.69f)
                curveToRelative(-0.38f, -0.4f, -0.37f, -1.03f, 0.03f, -1.41f)
                lineTo(9.89f, 0.86f)
                curveToRelative(1.1f, -1.11f, 3.1f, -1.12f, 4.23f, 0.01f)
                lineToRelative(4.57f, 4.4f)
                curveToRelative(0.4f, 0.38f, 0.41f, 1.02f, 0.03f, 1.41f)
                curveToRelative(-0.2f, 0.2f, -0.46f, 0.31f, -0.72f, 0.31f)
                curveToRelative(-0.25f, 0f, -0.5f, -0.09f, -0.69f, -0.28f)
                lineTo(13f, 2.58f)
                verticalLineToRelative(13.43f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                lineTo(11f, 2.58f)
                lineTo(6.69f, 6.72f)
                curveToRelative(-0.4f, 0.38f, -1.03f, 0.37f, -1.41f, -0.03f)
                close()
                moveTo(21f, 8f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                lineTo(7f, 22f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                lineTo(4f, 9f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(10f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                lineTo(22f, 9f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                close()
            }
        }.also { _ArrowUpFromSquare = it}
