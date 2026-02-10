package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FmRadio: ImageVector? = null

val Icons.Rs.FmRadio: ImageVector
    get() = _FmRadio ?: UXIcon(name = "FmRadio") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 7f)
                lineTo(8.07f, 7f)
                lineTo(21.38f, 1.93f)
                lineTo(20.67f, 0.06f)
                lineTo(1.91f, 7.21f)
                lineToRelative(0.0f, 0.01f)
                curveToRelative(-1.12f, 0.44f, -1.91f, 1.52f, -1.91f, 2.79f)
                verticalLineToRelative(14f)
                lineTo(24f, 24f)
                lineTo(24f, 10f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(22f, 22f)
                lineTo(2f, 22f)
                lineTo(2f, 10f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                lineTo(21f, 9f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(12f)
                close()
                moveTo(6f, 12f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(1.6f)
                horizontalLineToRelative(-2.4f)
                verticalLineToRelative(1.8f)
                horizontalLineToRelative(2.4f)
                verticalLineToRelative(1.6f)
                horizontalLineToRelative(-2.4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-1.6f)
                lineTo(6f, 12f)
                close()
                moveTo(17.49f, 13f)
                lineToRelative(0.51f, 7f)
                horizontalLineToRelative(-1.6f)
                lineToRelative(-0.32f, -4.4f)
                lineToRelative(-1.58f, 3.47f)
                lineToRelative(-1.58f, -3.47f)
                lineToRelative(-0.32f, 4.4f)
                horizontalLineToRelative(-1.6f)
                lineToRelative(0.51f, -7f)
                curveToRelative(0.04f, -1.16f, 1.41f, -1.35f, 1.83f, -0.36f)
                lineToRelative(1.16f, 2.56f)
                lineToRelative(1.16f, -2.56f)
                curveToRelative(0.42f, -0.99f, 1.78f, -0.8f, 1.83f, 0.36f)
                close()
            }
        }.also { _FmRadio = it}
