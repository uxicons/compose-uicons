package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Square7: ImageVector? = null

val Icons.Tr.Square7: ImageVector
    get() = _Square7 ?: UXIcon(name = "Square7") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.5f, 24f)
                lineTo(4.5f, 24f)
                curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
                lineTo(0f, 4.5f)
                curveTo(0f, 2.02f, 2.02f, 0f, 4.5f, 0f)
                horizontalLineToRelative(15f)
                curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
                close()
                moveTo(4.5f, 1f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(15f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                lineTo(23f, 4.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                lineTo(4.5f, 1f)
                close()
                moveTo(9.92f, 17.77f)
                lineToRelative(5.9f, -9.36f)
                curveToRelative(0.26f, -0.52f, 0.23f, -1.13f, -0.07f, -1.62f)
                curveToRelative(-0.31f, -0.49f, -0.83f, -0.79f, -1.42f, -0.79f)
                horizontalLineToRelative(-5.83f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(5.83f)
                curveToRelative(0.24f, 0f, 0.44f, 0.12f, 0.57f, 0.32f)
                reflectiveCurveToRelative(0.14f, 0.44f, 0.05f, 0.6f)
                lineToRelative(-5.88f, 9.31f)
                curveToRelative(-0.15f, 0.23f, -0.08f, 0.54f, 0.16f, 0.69f)
                curveToRelative(0.08f, 0.05f, 0.17f, 0.08f, 0.27f, 0.08f)
                curveToRelative(0.17f, 0f, 0.33f, -0.08f, 0.42f, -0.23f)
                close()
            }
        }.also { _Square7 = it}
