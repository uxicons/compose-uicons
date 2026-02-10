package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DocumentPaid: ImageVector? = null

val Icons.Ss.DocumentPaid: ImageVector
    get() = _DocumentPaid ?: UXIcon(name = "DocumentPaid") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5.1f, 13.6f)
                curveToRelative(0.5f, 0f, 0.9f, 0.4f, 0.9f, 0.9f)
                reflectiveCurveToRelative(-0.4f, 0.9f, -0.9f, 0.9f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(-1.8f)
                horizontalLineToRelative(0.5f)
                moveToRelative(5.14f, 0.11f)
                lineToRelative(0.64f, 3.29f)
                horizontalLineToRelative(-1.26f)
                lineToRelative(0.62f, -3.29f)
                moveTo(17f, 0.59f)
                verticalLineToRelative(4.41f)
                horizontalLineToRelative(4.41f)
                lineTo(17f, 0.59f)
                close()
                moveTo(15f, 7f)
                lineTo(15f, 0f)
                lineTo(5f, 0f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                verticalLineToRelative(21f)
                horizontalLineToRelative(20f)
                lineTo(22f, 7f)
                horizontalLineToRelative(-7f)
                close()
                moveTo(16.4f, 12f)
                horizontalLineToRelative(2.3f)
                curveToRelative(1.27f, 0f, 2.3f, 1.03f, 2.3f, 2.3f)
                verticalLineToRelative(3.4f)
                curveToRelative(0f, 1.27f, -1.03f, 2.3f, -2.3f, 2.3f)
                horizontalLineToRelative(-2.3f)
                verticalLineToRelative(-8f)
                close()
                moveTo(13.8f, 12f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(-8f)
                close()
                moveTo(10.26f, 12f)
                curveToRelative(0.76f, 0f, 1.23f, 0.52f, 1.35f, 1.19f)
                lineToRelative(1.4f, 6.81f)
                horizontalLineToRelative(-1.49f)
                lineToRelative(-0.26f, -1.47f)
                horizontalLineToRelative(-2.01f)
                lineToRelative(-0.28f, 1.47f)
                horizontalLineToRelative(-1.47f)
                lineToRelative(1.37f, -6.83f)
                curveToRelative(0.1f, -0.58f, 0.63f, -1.17f, 1.39f, -1.17f)
                close()
                moveTo(4.6f, 17.0f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(2.1f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-0.5f)
                close()
                moveTo(19.4f, 17.7f)
                curveToRelative(0f, 0.39f, -0.31f, 0.7f, -0.7f, 0.7f)
                reflectiveCurveToRelative(-0.7f, 0f, -0.7f, 0f)
                verticalLineToRelative(-4.8f)
                reflectiveCurveToRelative(0.31f, 0f, 0.7f, 0f)
                reflectiveCurveToRelative(0.7f, 0.31f, 0.7f, 0.7f)
                verticalLineToRelative(3.4f)
                close()
            }
        }.also { _DocumentPaid = it}
