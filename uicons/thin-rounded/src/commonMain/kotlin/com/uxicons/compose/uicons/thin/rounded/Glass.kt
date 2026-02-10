package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Glass: ImageVector? = null

val Icons.Tr.Glass: ImageVector
    get() = _Glass ?: UXIcon(name = "Glass") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.36f, 0.83f)
                curveToRelative(-0.47f, -0.53f, -1.15f, -0.83f, -1.86f, -0.83f)
                lineTo(4.5f, 0f)
                curveToRelative(-0.71f, 0f, -1.39f, 0.3f, -1.86f, 0.83f)
                reflectiveCurveToRelative(-0.7f, 1.24f, -0.62f, 1.94f)
                lineToRelative(1.87f, 17.22f)
                curveToRelative(0.25f, 2.29f, 2.17f, 4.01f, 4.47f, 4.01f)
                horizontalLineToRelative(7.28f)
                curveToRelative(2.3f, 0f, 4.22f, -1.73f, 4.47f, -4.01f)
                lineToRelative(1.87f, -17.22f)
                horizontalLineToRelative(0f)
                curveToRelative(0.08f, -0.7f, -0.15f, -1.41f, -0.62f, -1.94f)
                close()
                moveTo(20.99f, 2.66f)
                lineToRelative(-1.87f, 17.22f)
                curveToRelative(-0.19f, 1.78f, -1.69f, 3.12f, -3.48f, 3.12f)
                horizontalLineToRelative(-7.28f)
                curveToRelative(-1.79f, 0f, -3.29f, -1.34f, -3.48f, -3.12f)
                lineToRelative(-1.29f, -11.88f)
                horizontalLineToRelative(13.91f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                lineTo(3.48f, 7.0f)
                lineToRelative(-0.47f, -4.34f)
                curveToRelative(-0.05f, -0.43f, 0.09f, -0.84f, 0.38f, -1.16f)
                curveToRelative(0.29f, -0.32f, 0.69f, -0.5f, 1.12f, -0.5f)
                horizontalLineToRelative(15f)
                curveToRelative(0.43f, 0f, 0.83f, 0.18f, 1.12f, 0.5f)
                curveToRelative(0.29f, 0.32f, 0.42f, 0.73f, 0.38f, 1.16f)
                close()
            }
        }.also { _Glass = it}
