package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DeleteDocument: ImageVector? = null

val Icons.Tr.DeleteDocument: ImageVector
    get() = _DeleteDocument ?: UXIcon(name = "DeleteDocument") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.6f, 12.1f)
                lineToRelative(-2.9f, 2.9f)
                lineToRelative(2.9f, 2.9f)
                curveToRelative(0.2f, 0.2f, 0.2f, 0.51f, 0f, 0.71f)
                curveToRelative(-0.1f, 0.1f, -0.23f, 0.15f, -0.35f, 0.15f)
                reflectiveCurveToRelative(-0.26f, -0.05f, -0.35f, -0.15f)
                lineToRelative(-2.9f, -2.9f)
                lineToRelative(-2.9f, 2.9f)
                curveToRelative(-0.1f, 0.1f, -0.23f, 0.15f, -0.35f, 0.15f)
                reflectiveCurveToRelative(-0.26f, -0.05f, -0.35f, -0.15f)
                curveToRelative(-0.2f, -0.2f, -0.2f, -0.51f, 0f, -0.71f)
                lineToRelative(2.9f, -2.9f)
                lineToRelative(-2.9f, -2.9f)
                curveToRelative(-0.2f, -0.2f, -0.2f, -0.51f, 0f, -0.71f)
                reflectiveCurveToRelative(0.51f, -0.2f, 0.71f, 0f)
                lineToRelative(2.9f, 2.9f)
                lineToRelative(2.9f, -2.9f)
                curveToRelative(0.2f, -0.2f, 0.51f, -0.2f, 0.71f, 0f)
                reflectiveCurveToRelative(0.2f, 0.51f, 0f, 0.71f)
                close()
                moveTo(22f, 9.99f)
                verticalLineToRelative(9.52f)
                curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
                lineTo(6.5f, 24.0f)
                curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
                lineTo(2f, 4.5f)
                curveTo(2f, 2.02f, 4.02f, 0f, 6.5f, 0f)
                horizontalLineToRelative(5.51f)
                curveToRelative(1.74f, 0f, 3.37f, 0.68f, 4.6f, 1.9f)
                lineToRelative(3.48f, 3.48f)
                curveToRelative(1.23f, 1.23f, 1.9f, 2.86f, 1.9f, 4.6f)
                close()
                moveTo(15.9f, 2.61f)
                curveToRelative(-0.55f, -0.55f, -1.2f, -0.96f, -1.9f, -1.23f)
                verticalLineToRelative(5.12f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(5.12f)
                curveToRelative(-0.27f, -0.7f, -0.68f, -1.35f, -1.23f, -1.9f)
                lineToRelative(-3.48f, -3.48f)
                close()
                moveTo(21f, 9.99f)
                curveToRelative(0f, -0.34f, -0.04f, -0.66f, -0.1f, -0.98f)
                horizontalLineToRelative(-5.4f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                lineTo(13f, 1.1f)
                curveToRelative(-0.32f, -0.06f, -0.65f, -0.1f, -0.98f, -0.1f)
                horizontalLineToRelative(-5.51f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(11f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-9.52f)
                close()
            }
        }.also { _DeleteDocument = it}
