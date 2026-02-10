package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SourceDocument: ImageVector? = null

val Icons.Bs.SourceDocument: ImageVector
    get() = _SourceDocument ?: UXIcon(name = "SourceDocument") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 12f)
                lineTo(7f, 12f)
                verticalLineToRelative(8.5f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(6.5f)
                verticalLineToRelative(-0.05f)
                curveToRelative(1.14f, -0.23f, 2f, -1.24f, 2f, -2.45f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-6f)
                close()
                moveTo(10f, 20.5f)
                verticalLineToRelative(-5.5f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.23f, -0.5f, -0.5f)
                close()
                moveTo(9f, 3f)
                curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.34f, 3f, 3f)
                curveToRelative(0f, 1.11f, -0.61f, 2.06f, -1.5f, 2.58f)
                verticalLineToRelative(4.42f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-4.42f)
                curveToRelative(-0.89f, -0.52f, -1.5f, -1.48f, -1.5f, -2.58f)
                close()
                moveTo(24f, 6f)
                curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
                curveToRelative(-0.18f, 0f, -0.36f, -0.02f, -0.54f, -0.05f)
                lineToRelative(-2.15f, 2.53f)
                lineToRelative(-2.28f, -1.95f)
                lineToRelative(2.15f, -2.53f)
                curveToRelative(-0.11f, -0.31f, -0.18f, -0.65f, -0.18f, -1.0f)
                curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.34f, 3f, 3f)
                close()
                moveTo(5.69f, 11.47f)
                lineToRelative(-2.15f, -2.53f)
                curveToRelative(-0.17f, 0.03f, -0.35f, 0.05f, -0.54f, 0.05f)
                curveToRelative(-1.66f, 0f, -3f, -1.34f, -3f, -3f)
                reflectiveCurveToRelative(1.34f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.34f, 3f, 3f)
                curveToRelative(0f, 0.35f, -0.07f, 0.68f, -0.18f, 1.0f)
                lineToRelative(2.15f, 2.53f)
                lineToRelative(-2.28f, 1.95f)
                close()
            }
        }.also { _SourceDocument = it}
