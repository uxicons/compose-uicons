package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Snowboarding: ImageVector? = null

val Icons.Bs.Snowboarding: ImageVector
    get() = _Snowboarding ?: UXIcon(name = "Snowboarding") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.15f, 20.23f)
                arcToRelative(1.34f, 1.34f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.77f, 0.69f)
                arcToRelative(1.38f, 1.38f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.08f, -0.08f)
                lineTo(17f, 19.83f)
                verticalLineTo(14.35f)
                lineToRelative(-3.83f, -3.61f)
                lineToRelative(1.5f, -2.05f)
                lineToRelative(7.01f, 4.57f)
                lineToRelative(1.64f, -2.51f)
                lineTo(11.45f, 3f)
                horizontalLineTo(7.62f)
                lineTo(4.67f, 0.07f)
                lineTo(2.56f, 2.19f)
                lineTo(6.38f, 6f)
                horizontalLineToRelative(4.17f)
                lineToRelative(0.09f, 0.06f)
                lineTo(8.72f, 8.55f)
                arcTo(3.52f, 3.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 10.68f)
                verticalLineToRelative(2.3f)
                lineTo(4.56f, 14.36f)
                lineToRelative(-0.78f, -0.34f)
                arcToRelative(1.35f, 1.35f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.66f, -1.79f)
                lineTo(0.4f, 10.96f)
                arcToRelative(4.36f, 4.36f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.15f, 5.79f)
                lineToRelative(15.5f, 6.82f)
                arcToRelative(4.35f, 4.35f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.8f, -2.04f)
                close()
                moveTo(11f, 15.02f)
                verticalLineToRelative(-2.2f)
                lineToRelative(3f, 2.83f)
                verticalLineToRelative(2.87f)
                lineTo(8.41f, 16.05f)
                close()
                moveTo(14f, 2.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 16.5f, 5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 2.5f)
                close()
            }
        }.also { _Snowboarding = it}
