package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Trademark: ImageVector? = null

val Icons.Tr.Trademark: ImageVector
    get() = _Trademark ?: UXIcon(name = "Trademark") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 5.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                lineTo(6f, 6f)
                verticalLineToRelative(12.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                lineTo(5f, 6f)
                lineTo(0.5f, 6f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                lineTo(10.5f, 5f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                close()
                moveTo(22.44f, 5f)
                curveToRelative(-0.58f, 0f, -1.11f, 0.32f, -1.38f, 0.83f)
                lineToRelative(-3.05f, 5.62f)
                lineToRelative(-3.05f, -5.62f)
                curveToRelative(-0.27f, -0.52f, -0.8f, -0.84f, -1.38f, -0.84f)
                curveToRelative(-0.86f, 0f, -1.56f, 0.7f, -1.56f, 1.56f)
                verticalLineToRelative(11.94f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                lineTo(13.02f, 6.56f)
                curveToRelative(0f, -0.31f, 0.25f, -0.56f, 0.56f, -0.56f)
                curveToRelative(0.21f, 0f, 0.4f, 0.12f, 0.5f, 0.31f)
                lineToRelative(3.49f, 6.43f)
                curveToRelative(0.17f, 0.32f, 0.7f, 0.32f, 0.88f, 0f)
                lineToRelative(3.5f, -6.44f)
                curveToRelative(0.1f, -0.19f, 0.29f, -0.3f, 0.5f, -0.3f)
                curveToRelative(0.31f, 0f, 0.56f, 0.25f, 0.56f, 0.56f)
                verticalLineToRelative(11.94f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                lineTo(24.01f, 6.56f)
                curveToRelative(0f, -0.86f, -0.7f, -1.56f, -1.56f, -1.56f)
                close()
            }
        }.also { _Trademark = it}
