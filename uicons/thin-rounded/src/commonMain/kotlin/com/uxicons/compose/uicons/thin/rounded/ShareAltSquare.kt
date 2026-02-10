package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShareAltSquare: ImageVector? = null

val Icons.Tr.ShareAltSquare: ImageVector
    get() = _ShareAltSquare ?: UXIcon(name = "ShareAltSquare") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 10f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                reflectiveCurveToRelative(-1.35f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.35f, -3f, 3f)
                curveToRelative(0f, 0.35f, 0.06f, 0.69f, 0.17f, 1.0f)
                lineToRelative(-3.83f, 2.13f)
                curveToRelative(-0.55f, -0.69f, -1.4f, -1.13f, -2.34f, -1.13f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                reflectiveCurveToRelative(1.35f, 3f, 3f, 3f)
                curveToRelative(0.95f, 0f, 1.79f, -0.44f, 2.34f, -1.13f)
                lineToRelative(3.83f, 2.13f)
                curveToRelative(-0.11f, 0.31f, -0.17f, 0.65f, -0.17f, 1.0f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                reflectiveCurveToRelative(-1.35f, -3f, -3f, -3f)
                curveToRelative(-0.95f, 0f, -1.79f, 0.44f, -2.34f, 1.13f)
                lineToRelative(-3.83f, -2.13f)
                curveToRelative(0.11f, -0.31f, 0.17f, -0.65f, 0.17f, -1.0f)
                reflectiveCurveToRelative(-0.06f, -0.69f, -0.17f, -1.0f)
                lineToRelative(3.83f, -2.13f)
                curveToRelative(0.55f, 0.69f, 1.4f, 1.13f, 2.34f, 1.13f)
                close()
                moveTo(16f, 15f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                curveToRelative(0f, -1.36f, 1.26f, -2f, 2f, -2f)
                close()
                moveTo(7f, 14f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                close()
                moveTo(16f, 5f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                curveToRelative(-1.13f, 0f, -2f, -1f, -2f, -2f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                close()
                moveTo(19.5f, 0f)
                lineTo(4.5f, 0f)
                curveTo(2.02f, 0f, 0f, 2.02f, 0f, 4.5f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(15f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                lineTo(24f, 4.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(23f, 19.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                lineTo(4.5f, 23f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineTo(1f, 4.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(15f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(15f)
                close()
            }
        }.also { _ShareAltSquare = it}
