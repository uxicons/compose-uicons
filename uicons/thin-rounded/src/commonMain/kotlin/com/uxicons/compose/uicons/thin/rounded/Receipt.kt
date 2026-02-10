package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Receipt: ImageVector? = null

val Icons.Tr.Receipt: ImageVector
    get() = _Receipt ?: UXIcon(name = "Receipt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.5f, 0f)
                lineTo(7.5f, 0f)
                curveTo(5.02f, 0f, 3f, 2.02f, 3f, 4.5f)
                verticalLineToRelative(18.5f)
                curveToRelative(0f, 0.37f, 0.2f, 0.71f, 0.53f, 0.89f)
                curveToRelative(0.32f, 0.17f, 0.73f, 0.15f, 1.03f, -0.06f)
                lineToRelative(2.11f, -1.44f)
                lineToRelative(2.11f, 1.44f)
                curveToRelative(0.34f, 0.23f, 0.79f, 0.23f, 1.13f, -0.0f)
                lineToRelative(2.1f, -1.44f)
                lineToRelative(2.1f, 1.44f)
                curveToRelative(0.17f, 0.12f, 0.37f, 0.18f, 0.56f, 0.18f)
                curveToRelative(0.2f, 0f, 0.4f, -0.06f, 0.57f, -0.18f)
                lineToRelative(2.1f, -1.44f)
                lineToRelative(2.1f, 1.44f)
                curveToRelative(0.31f, 0.21f, 0.7f, 0.23f, 1.03f, 0.06f)
                curveToRelative(0.33f, -0.17f, 0.53f, -0.51f, 0.53f, -0.89f)
                lineTo(21.0f, 4.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(20f, 23f)
                lineToRelative(-2.38f, -1.63f)
                curveToRelative(-0.17f, -0.12f, -0.4f, -0.12f, -0.56f, 0f)
                lineToRelative(-2.38f, 1.63f)
                lineToRelative(-2.38f, -1.63f)
                curveToRelative(-0.17f, -0.12f, -0.4f, -0.12f, -0.56f, 0f)
                lineToRelative(-2.38f, 1.63f)
                lineToRelative(-2.39f, -1.63f)
                curveToRelative(-0.17f, -0.12f, -0.4f, -0.12f, -0.56f, 0f)
                lineToRelative(-2.39f, 1.63f)
                lineTo(4.0f, 4.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(9f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(18.5f)
                close()
                moveTo(17f, 7.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                lineTo(7.5f, 8f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(9f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                close()
                moveTo(17f, 10.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                lineTo(7.5f, 11f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(9f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                close()
                moveTo(14f, 13.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-6f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(6f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                close()
            }
        }.also { _Receipt = it}
