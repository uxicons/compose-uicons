package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Dictionary: ImageVector? = null

val Icons.Bs.Dictionary: ImageVector
    get() = _Dictionary ?: UXIcon(name = "Dictionary") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.5f, 0f)
                lineTo(5f, 0f)
                curveTo(2.79f, 0f, 1f, 1.79f, 1f, 4f)
                lineTo(1f, 20f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                lineTo(23f, 24f)
                lineTo(23f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(5f, 3f)
                horizontalLineToRelative(15f)
                verticalLineToRelative(13f)
                lineTo(5f, 16f)
                curveToRelative(-0.35f, 0f, -0.68f, 0.06f, -1f, 0.14f)
                lineTo(4f, 4f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                close()
                moveTo(5f, 21f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(15f)
                verticalLineToRelative(2f)
                lineTo(5f, 21f)
                close()
                moveTo(6.82f, 12f)
                horizontalLineToRelative(2.15f)
                lineToRelative(0.22f, 0.99f)
                horizontalLineToRelative(1.67f)
                lineToRelative(-1.27f, -5.57f)
                curveToRelative(-0.31f, -1.85f, -2.97f, -1.84f, -3.3f, -0.04f)
                lineToRelative(-1.29f, 5.61f)
                horizontalLineToRelative(1.58f)
                lineToRelative(0.24f, -0.99f)
                close()
                moveTo(7.85f, 7.72f)
                curveToRelative(0.02f, -0.07f, 0.05f, -0.12f, 0.1f, -0.12f)
                curveToRelative(0.01f, 0.01f, 0.06f, 0.06f, 0.08f, 0.18f)
                lineToRelative(0.58f, 2.62f)
                horizontalLineToRelative(-1.41f)
                lineToRelative(0.65f, -2.68f)
                close()
                moveTo(13.5f, 10f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1.6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1.6f)
                close()
                moveTo(19f, 13f)
                horizontalLineToRelative(-4.55f)
                verticalLineToRelative(-1.72f)
                lineToRelative(2.56f, -3.69f)
                horizontalLineToRelative(-2.56f)
                verticalLineToRelative(-1.6f)
                horizontalLineToRelative(4.55f)
                verticalLineToRelative(1.72f)
                lineToRelative(-2.56f, 3.69f)
                horizontalLineToRelative(2.56f)
                verticalLineToRelative(1.6f)
                close()
            }
        }.also { _Dictionary = it}
