package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FileImage: ImageVector? = null

val Icons.Tr.FileImage: ImageVector
    get() = _FileImage ?: UXIcon(name = "FileImage") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6f, 10f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                close()
                moveTo(22f, 9.98f)
                verticalLineToRelative(9.52f)
                curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
                lineTo(6.5f, 24f)
                curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
                lineTo(2f, 4.5f)
                curveTo(2f, 2.02f, 4.01f, 0f, 6.5f, 0f)
                horizontalLineToRelative(5.51f)
                curveToRelative(1.72f, 0f, 3.38f, 0.69f, 4.6f, 1.9f)
                lineToRelative(3.48f, 3.48f)
                curveToRelative(1.22f, 1.22f, 1.9f, 2.87f, 1.9f, 4.6f)
                close()
                moveTo(15.9f, 2.61f)
                curveToRelative(-0.55f, -0.55f, -1.2f, -0.97f, -1.9f, -1.24f)
                verticalLineToRelative(5.13f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(5.13f)
                curveToRelative(-0.27f, -0.71f, -0.69f, -1.35f, -1.24f, -1.9f)
                lineToRelative(-3.48f, -3.48f)
                close()
                moveTo(3f, 19.5f)
                curveToRelative(0f, 0.52f, 0.12f, 1.02f, 0.32f, 1.47f)
                lineToRelative(6.09f, -6.09f)
                curveToRelative(1.15f, -1.15f, 3.02f, -1.15f, 4.17f, 0f)
                lineToRelative(0.61f, 0.61f)
                curveToRelative(0.72f, 0.72f, 1.88f, 0.72f, 2.6f, 0f)
                lineToRelative(4.2f, -4.2f)
                verticalLineToRelative(-1.31f)
                curveToRelative(0f, -0.33f, -0.03f, -0.66f, -0.09f, -0.98f)
                horizontalLineToRelative(-5.41f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                lineTo(13.0f, 1.09f)
                curveToRelative(-0.32f, -0.06f, -0.65f, -0.09f, -0.98f, -0.09f)
                horizontalLineToRelative(-5.51f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(15f)
                close()
                moveTo(21f, 19.5f)
                verticalLineToRelative(-6.79f)
                lineToRelative(-3.49f, 3.49f)
                curveToRelative(-1.11f, 1.11f, -2.91f, 1.11f, -4.01f, 0f)
                lineToRelative(-0.61f, -0.61f)
                curveToRelative(-0.76f, -0.76f, -2.0f, -0.76f, -2.75f, 0f)
                lineToRelative(-6.24f, 6.24f)
                curveToRelative(0.64f, 0.72f, 1.58f, 1.18f, 2.62f, 1.18f)
                horizontalLineToRelative(11f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                close()
            }
        }.also { _FileImage = it}
